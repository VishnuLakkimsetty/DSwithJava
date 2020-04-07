// https://www.geeksforgeeks.org/lru-cache-implementation/

package main.java.Queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
	static Deque<Integer> d;
	static HashSet<Integer> m;
	static int size;

	LRUCache(int i) {
		d = new LinkedList<>();
		m = new HashSet<>();
		size = i;
	}

	public static void main(String[] args) {
		LRUCache ca = new LRUCache(4);
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.display();
		System.out.println("\n");
		ca.refer(1);
		ca.display();
		System.out.println("\n");
		ca.refer(4);
		ca.display();
		System.out.println("\n");
		ca.refer(5);
		ca.display();
	}

	private void display() {
		Iterator<Integer> itr = d.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

	}

	private void refer(int i) {
		if (!m.contains(i)) {
			if (d.size() == size) {
				int a = d.removeLast();
				m.remove(a);
			}
		} else {
			d.remove(i);
		}

		d.push(i);
		m.add(i);
	}

}
