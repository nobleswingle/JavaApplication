for (int i = 1; i <= 256; i++) {
    System.out.printf("%d	%s	%s	%s%n", i,
        Integer.toBinaryString(i),
        Integer.toOctalString(i),
        Integer.toHexString(i).toUpperCase());
}
