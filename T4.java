
// Or using Arrays.copyOf
int[] resultArray2 = Arrays.copyOf(array1, array1.length + array2.length);
System.arraycopy(array2, 0, resultArray2, array1.length, array2.length);

int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
boolean equalArrays = Arrays.equals(array1, array2); // true



