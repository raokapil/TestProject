package com.company.dataStructure.recursion;

// find ways to invite guest (individual or pair)
public class InviteGuestWays {

    public static int inviteGuest(int n) {
        if (n <= 1) {
            return 1;
        }

        int ways1 = inviteGuest(n-1);
        int ways2 = (n - 1) * inviteGuest(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(inviteGuest(n));
    }
}
