public class MergeSort {

  @SuppressWarnings("unchecked")
  public static void sort(Comparable[] array) {
    sort(array, 0, array.length);
  }

  @SuppressWarnings("unchecked")
  public static void sort(Comparable[] array, int i, int j) {
    int l;
    if((l = j - i) > 1) {
      sort(array, i, i + l / 2);
      sort(array, i + l / 2, j);
      Comparable[] t = new Comparable[l];
      int a = i, b = i + l / 2;
      for(int k = 0; k < l; k++) {
        if(a == i + l / 2) {
          t[k] = array[b++];
        } else if(b == j) {
          t[k] = array[a++];
        } else {
          t[k] = (array[a].compareTo(array[b])>0) ? array[b++] : array[a++];
        }
      }
      for(int k = 0; k < l; k++) {
        array[i+k] = t[k];
      }
    }
  }

}
