/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.triniwiz.tns.pager;

@com.tns.JavaScriptImplementation(javaScriptFile = "./tns_modules/nativescript-pager/pager.js")
public class TNSViewPager extends android.support.v4.view.ViewPager implements com.tns.NativeScriptHashCodeProvider {
	public TNSViewPager(android.content.Context param_0){
		super(param_0);
		com.tns.Runtime.initInstance(this);
	}

	public TNSViewPager(android.content.Context param_0, android.util.AttributeSet param_1){
		super(param_0, param_1);
		com.tns.Runtime.initInstance(this);
	}

	public boolean onInterceptTouchEvent(android.view.MotionEvent param_0)  {
		java.lang.Object[] args = new java.lang.Object[1];
		args[0] = param_0;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onInterceptTouchEvent", boolean.class, args);
	}

	public boolean onTouchEvent(android.view.MotionEvent param_0)  {
		java.lang.Object[] args = new java.lang.Object[1];
		args[0] = param_0;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onTouchEvent", boolean.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
