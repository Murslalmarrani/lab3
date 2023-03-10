
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
int[] resultArray = new int[array1.length + array2.length];

System.arraycopy(array1, 0, resultArray, 0, array1.length);
System.arraycopy(array2, 0, resultArray, array1.length, array2.length);
