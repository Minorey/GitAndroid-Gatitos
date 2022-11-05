package com.example.myfirstapp

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class AspectRatioImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    var ratio: Float = 1f
    init {
        val a =  context.obtainStyledAttributes(attrs, R.styleable.AspectRatioImageView)
        ratio = a.getFloat(R.styleable.AspectRatioImageView_ratio, 1f)
        a.recycle()
    }
    //propone el tamaño de vista OnMeasure
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var width = measuredWidth
        var height = measuredHeight

        //comprobamos que ninguna de las dos sea cero
        if (width==0 && height ==0){
            return
            //return para que no se ejecute xq no se ha terminado de medir la vista
        }
        //comprobamos que sea diferente de 0
        if (width > 0){
            //la altura en funcion del ancho
            height = (width*ratio).toInt()
        } else if(height > 0) {
            width = (height / ratio).toInt()
        }
            //el ancho respecto a la altura
        setMeasuredDimension(width, height)
    }

}