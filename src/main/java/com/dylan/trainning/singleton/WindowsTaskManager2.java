package com.dylan.trainning.singleton;

/**
 * 
 * @author dylan.duan
 *lazy loading with performance issues
 */
public class WindowsTaskManager2 {

	private WindowsTaskManager2 tm;

	private WindowsTaskManager2() {
	};

	public WindowsTaskManager2 getInstance() {

		if (tm == null) {
			synchronized (WindowsTaskManager2.class) {
				if (tm == null)
					tm = new WindowsTaskManager2();
			}
		}

		return tm;
	}

}
