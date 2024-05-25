package src.lc.Strings;

public class CompareVersion {
    public static void main(String[] args) {
       String  version1 = "0.1", version2 = "1.1";
       compareVersion(version1,version2);
    }
    public static int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null || version1.isEmpty() || version2.isEmpty())
            throw new IllegalArgumentException("Input version strings cannot be null or empty");

        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int maxLength = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;
            int num2 = (i < arr2.length) ? Integer.parseInt(arr2[i]) : 0;

            if (num1 > num2)
                return 1;
            else if (num1 < num2)
                return -1;
        }

        return 0;
    }
}
