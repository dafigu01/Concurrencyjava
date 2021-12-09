class op1 extends Thread {
	@Override
	public void run() {
		for (int j = 20; j >= 0; j--) {
			System.out.println("Descending Count: " + j);
		}
	}
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setPriority(MAX_PRIORITY);
		for (int i = 0; i <= 20; i++) {
			System.out.println("Ascending Count: " + i);
		}
		op1 t2 = new op1();
		t2.start();
	}
}


	

