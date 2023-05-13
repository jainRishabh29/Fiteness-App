package com.example.testapp.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.testapp.R

class WorkoutFragment : Fragment() {

    private lateinit var composeView: ComposeView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).also {
            composeView = it
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView()

        composeView.setContent {
            WorkoutScreen()
        }
    }

    private fun setUpView() {
        view?.findViewById<TextView>(R.id.log_tv)?.apply {
            visibility = View.GONE
        }
    }
}