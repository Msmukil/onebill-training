package com.testyantra.accestest;

import java.util.LinkedList;
	public class objectclass {
		@Override
		public String toString() {
			return "0";
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof LinkedList<?>) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			return 1;
		}

		@Override
		protected void finalize() throws Throwable {
			System.out.println("this is from finalize");
		}

		public static void main(String[] args) {
			Demo objectclass1 = new Demo();
			System.out.println(objectclass1);

			Demo objectclass2 = new Demo();
			System.out.println("this is object 2 of demo" + objectclass2);

			objectclass1 = null;

			Demo objectclass3 = new Demo();
			int hashcode = objectclass3.hashCode();
			System.out.println(hashcode);
			objectclass2 = null;
			objectclass3 = null;
			System.gc();

		}

	}

