/* vim: set expandtab tabstop=4 shiftwidth=4 softtabstop=4: */

/**
 * This file is a homework for 01204341 Software Engineering, third year,
 * Computer Engineering, Kasetsart University, 2015
 *
 * LICENSE:
 * Copyright (c) 2015, Kanitkorn Sujautra
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 * @author     Kanitkorn Sujautra <k.sujautra@gmail.com>
 * @copyright  2015, Kanitkorn Sujautra
 * @license    MIT
 * @version    1.0.0
 * @since      File available since Release 1.0.0
 * @deprecated File deprecated in Release 2.0.0
 */

/**
 * This class is to find fibonacci numbers from entry 1020 to entry 1040 in a
 * binary form.
 * It need to create array of integer 10,000 entry.
 *
 * @author     Kanitkorn Sujautra <k.sujautra@gmail.com>
 * @copyright  2015, Kanitkorn Sujautra
 * @license    MIT
 * @version    1.0.0
 * @since      Class available since Release 1.0.0
 * @deprecated Class deprecated in Release 2.0.0
 */

import java.util.Scanner;
import java.math.*;

public class cFibo {

    private static int desiredLimit = 10000;
    private static int start = 1020;
    private static int entry = 20;
    private static BigInteger[] fibo = new BigInteger[desiredLimit+1];

    public static void main(String args[]) {
        preprocessFibonacciUpto(desiredLimit);
        getFiboValueInPhase(start, start + entry);
    }

    private static void preprocessFibonacciUpto(int limit) {
        fibo[0] = BigInteger.valueOf(0);
        fibo[1] = BigInteger.valueOf(1);
        for (int n=2; n <= limit; n++) {
            fibo[n] = fibo[n-1].add(fibo[n-2]);
        }
    }

    public static void getFiboValueInPhase(int from, int to) {
        for (int n = from; n <= to; n++) {
            System.out.format("f(%d): %s%n", n, fibo[n].toString(2));
            System.out.println("-------------------------");
        }
    }
}
