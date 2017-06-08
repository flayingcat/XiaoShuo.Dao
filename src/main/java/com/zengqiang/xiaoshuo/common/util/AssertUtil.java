package com.zengqiang.xiaoshuo.common.util;

import com.zengqiang.xiaoshuo.common.exception.XiaoShuoException;

public class AssertUtil {
	public static String assertNotBlank(String message, String s) {
		if (s == null || (s = s.trim()).length() == 0) {
			throw new XiaoShuoException(message);
		}
		return s;
	}

	public static String $(String message, String s) {
		return assertNotBlank(message, s);
	}

	public static void assertEquals(String message, Object a, Object b) {
		if (!a.equals(b)) {
			throw new XiaoShuoException(message);
		}
	}

	public static void assertNotEquals(String message, Object a, Object b) {
		if (a.equals(b)) {
			throw new XiaoShuoException(message);
		}
	}

	public static void assertTrue(String message, boolean b) {
		if (!b) {
			throw new XiaoShuoException(message);
		}
	}

	public static void assertNotNull(String message, Object b) {
		if (b == null) {
			throw new XiaoShuoException(message);
		}
	}

	public static void assertNull(String message, Object b) {
		if (b != null) {
			throw new XiaoShuoException(message);
		}
	}

	public static void assertFalse(String message, boolean b) {
		if (b) {
			throw new XiaoShuoException(message);
		}
	}
}
