package md54ddc05acb0b7fb9f1df61f108ab89efe;


public class ThrottleControlRenderer
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.SliderRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DroneLander.Droid.Renderers.ThrottleControlRenderer, DroneLander.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ThrottleControlRenderer.class, __md_methods);
	}


	public ThrottleControlRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ThrottleControlRenderer.class)
			mono.android.TypeManager.Activate ("DroneLander.Droid.Renderers.ThrottleControlRenderer, DroneLander.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ThrottleControlRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ThrottleControlRenderer.class)
			mono.android.TypeManager.Activate ("DroneLander.Droid.Renderers.ThrottleControlRenderer, DroneLander.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public ThrottleControlRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ThrottleControlRenderer.class)
			mono.android.TypeManager.Activate ("DroneLander.Droid.Renderers.ThrottleControlRenderer, DroneLander.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
