package ir.Rojadev.bottomnavigation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.Rojadev.bottomnavigation.Fragments.FourFragment;
import ir.Rojadev.bottomnavigation.Fragments.ThreeFragment;
import ir.Rojadev.bottomnavigation.Fragments.OneFragment;
import ir.Rojadev.bottomnavigation.Fragments.TwoFragment;
import wiadevelopers.com.bottomnavigationlib.BottomNav.BottomNavigationView;
import wiadevelopers.com.bottomnavigationlib.Utils;

public class MainActivity extends AppCompatActivity
{

    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FourFragment fourFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        //Setup ViewPager
        setupViewPager(viewPager);
    }

    private void setupViewPager(final ViewPager viewPager)
    {
        Utils.ViewPagerAdapter adapter = new Utils.ViewPagerAdapter(getSupportFragmentManager());
            adapter.addFragment(new OneFragment());
            adapter.addFragment(new TwoFragment());
            adapter.addFragment(new ThreeFragment());
            adapter.addFragment(new FourFragment());
        Utils.setUpViewPager(MainActivity.this,viewPager,adapter,bottomNavigationView,R.menu.bottom_navigation_items,3,3);

    }
}
