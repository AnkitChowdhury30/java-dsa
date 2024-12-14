class customArrayList{
  private int[] arr;
  private int DEFAULT_SIZE =10;
  private int size=0;

  public customArrayList(int size){
    this.arr = new int[DEFAULT_SIZE];
  }

  public void add(int num){
    if(isFull()){
      resize();
    }
    arr[size++] = num ;
  }

  public void resize(){
    int[] arr2 = new int[arr.length * 2];

    // copy the value of arr to arr2

    for(int i=0;i<arr.length;i++){
      arr2[i] = arr[i];
    }

    arr=arr2;
  }
  private boolean isFull(){
    return size==arr.length;
  }
}

public class class20 {
  
}
