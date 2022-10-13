package lam.pam.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import lam.pam.droidcafe.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    public static final String EXTRA_MASSAGE ="com.example.android.twoactivities.extra.MESSAGE";
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Intent intent = new Intent(getActivity(), OrderActivity.class);
        view.findViewById(R.id.donut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.donut_order_message));
                String order ="Donat";
                intent.putExtra(EXTRA_MASSAGE, order);
                startActivity(intent);
            }
        });
        view.findViewById(R.id.ice_cream).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.ice_cream_order_message));
                String order ="Ice Cream";
                intent.putExtra(EXTRA_MASSAGE, order);
                startActivity(intent);
            }
        });

        view.findViewById(R.id.froyo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.froyo_order_message));
                String order ="Froyo";
                intent.putExtra(EXTRA_MASSAGE, order);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void displayToast(String message) {
        Toast.makeText(getActivity(), message,
                Toast.LENGTH_SHORT).show();
    }


}