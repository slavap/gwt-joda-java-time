package java.timejs;

import jsinterop.annotations.JsType;


@JsType(isNative=true, namespace="JSJoda", name="TextStyle")
public class TextStyle
{

    /*
        Methods
    */
    
    public native TextStyle asNormal();
    
    public native TextStyle asStandalone();
    
    public native Boolean isStandalone();
}
