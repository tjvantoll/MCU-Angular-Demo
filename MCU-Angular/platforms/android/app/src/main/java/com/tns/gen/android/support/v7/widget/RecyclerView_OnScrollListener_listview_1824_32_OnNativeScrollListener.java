/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.android.support.v7.widget;

public class RecyclerView_OnScrollListener_listview_1824_32_OnNativeScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener implements com.tns.NativeScriptHashCodeProvider {
	public RecyclerView_OnScrollListener_listview_1824_32_OnNativeScrollListener(){
		super();
		com.tns.Runtime.initInstance(this);
	}

	public void onScrolled(android.support.v7.widget.RecyclerView param_0, int param_1, int param_2)  {
		java.lang.Object[] args = new java.lang.Object[3];
		args[0] = param_0;
		args[1] = param_1;
		args[2] = param_2;
		com.tns.Runtime.callJSMethod(this, "onScrolled", void.class, args);
	}

	public void onScrollStateChanged(android.support.v7.widget.RecyclerView param_0, int param_1)  {
		java.lang.Object[] args = new java.lang.Object[2];
		args[0] = param_0;
		args[1] = param_1;
		com.tns.Runtime.callJSMethod(this, "onScrollStateChanged", void.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
