import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> list;

    public Sorter(List<Integer> list){
      this.list = list;
    }

	@Override
	public List<Integer> call() throws Exception {

        if(list.size()<=1){
            return list;
        }

        int mid = list.size() / 2;

        ArrayList<Integer> leftArray = new  ArrayList<Integer>();
        ArrayList<Integer>  rightArray = new  ArrayList<Integer>();

        for(int i =0;i<=mid;i++){
            leftArray.add(list.get(i));
        }

        for(int i = mid;i<list.size();i++){
            rightArray.add(list.get(i));
        }

        Sorter leftSorter = new Sorter(rightArray);
        Sorter  rightSorter = new Sorter(rightArray);


        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> futureLeftSorted =  executorService.submit(leftSorter);
        Future<List<Integer>> futureRightSorted = executorService.submit(rightSorter);

        int i=0;
        int j =0;

        List<Integer> leftSorted =futureLeftSorted.get();
        List<Integer> rightSorted =futureRightSorted.get();

        ArrayList<Integer> result = new ArrayList<>();
        
        while(i<leftSorted.size()&& j<rightSorted.size()){

            if(leftSorted.get(i)<rightSorted.get(j)){
                result.add(leftSorted.get(i));
                i++;
            }else{
                result.add(rightSorted.get(j));
                j++;
            }

        }

        
        while(i<leftSorted.size()){
            result.add(leftArray.get(i));
            i++;
        }

        while(j<rightSorted.size()){
            result.add(rightSorted.get(j));
            j++;
        }

        return result;
	}
    
}
