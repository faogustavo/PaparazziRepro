package com.example.paparazzi_bugs

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.appcompat.content.res.AppCompatResources
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.paparazzi_bugs.databinding.BugTextInputBinding

class BugTextInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding by viewBinding {
        BugTextInputBinding.inflate(LayoutInflater.from(context), this, true)
    }

    init {
        val boxStroke = AppCompatResources.getColorStateList(context, R.color.input_border)
        binding.textInputLayout.setBoxStrokeColorStateList(boxStroke)
    }
}
