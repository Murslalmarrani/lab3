
Person[] originalArray = {new Person("John", 25), new Person("Jane", 30)};
Person[] clonedArray1 = Arrays.copyOf(originalArray, originalArray.length);
Person[] clonedArray2 = originalArray.clone();
