package org.hshikhare.hackerrank.algorithm.implementation;

import java.util.Scanner;

/** Created by h_shikhare on 1/15/2017. https://www.hackerrank.com/challenges/designer-pdf-viewer */
public class DesignerPDFViewer {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 26;
    int h[] = new int[n];
    for (int h_i = 0; h_i < n; h_i++) {
      h[h_i] = in.nextInt();
    }
    String word = in.next();

    char[] chars = word.toCharArray();
    int height = 0;
    for (char c : chars) {
      height = height > h[(c - 'a' + 1)] ? height : h[(c - 'a' + 1)];
    }
    System.out.println(height * word.length());
  }
}
