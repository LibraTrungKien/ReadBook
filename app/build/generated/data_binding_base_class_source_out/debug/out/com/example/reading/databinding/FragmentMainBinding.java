// Generated by view binder compiler. Do not edit!
package com.example.reading.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.denzcoskun.imageslider.ImageSlider;
import com.example.reading.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final ImageView btnSearch;

  @NonNull
  public final ImageView crdUser;

  @NonNull
  public final DrawerLayout drwLayout;

  @NonNull
  public final ImageSlider imgAuthor;

  @NonNull
  public final EpoxyRecyclerView lstStory;

  @NonNull
  public final AppBarLayout lyt1;

  @NonNull
  public final LinearLayout lytLeftMenu;

  @NonNull
  public final LinearLayout lytProfile;

  @NonNull
  public final NavigationView navAuthor;

  @NonNull
  public final NavigationView navReader;

  @NonNull
  public final LinearProgressIndicator prgIndicator;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final TextView txtCost;

  @NonNull
  public final TextView txtName;

  private FragmentMainBinding(@NonNull DrawerLayout rootView, @NonNull ImageView btnSearch,
      @NonNull ImageView crdUser, @NonNull DrawerLayout drwLayout, @NonNull ImageSlider imgAuthor,
      @NonNull EpoxyRecyclerView lstStory, @NonNull AppBarLayout lyt1,
      @NonNull LinearLayout lytLeftMenu, @NonNull LinearLayout lytProfile,
      @NonNull NavigationView navAuthor, @NonNull NavigationView navReader,
      @NonNull LinearProgressIndicator prgIndicator, @NonNull MaterialToolbar toolbar,
      @NonNull TextView txtCost, @NonNull TextView txtName) {
    this.rootView = rootView;
    this.btnSearch = btnSearch;
    this.crdUser = crdUser;
    this.drwLayout = drwLayout;
    this.imgAuthor = imgAuthor;
    this.lstStory = lstStory;
    this.lyt1 = lyt1;
    this.lytLeftMenu = lytLeftMenu;
    this.lytProfile = lytProfile;
    this.navAuthor = navAuthor;
    this.navReader = navReader;
    this.prgIndicator = prgIndicator;
    this.toolbar = toolbar;
    this.txtCost = txtCost;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSearch;
      ImageView btnSearch = ViewBindings.findChildViewById(rootView, id);
      if (btnSearch == null) {
        break missingId;
      }

      id = R.id.crdUser;
      ImageView crdUser = ViewBindings.findChildViewById(rootView, id);
      if (crdUser == null) {
        break missingId;
      }

      DrawerLayout drwLayout = (DrawerLayout) rootView;

      id = R.id.imgAuthor;
      ImageSlider imgAuthor = ViewBindings.findChildViewById(rootView, id);
      if (imgAuthor == null) {
        break missingId;
      }

      id = R.id.lstStory;
      EpoxyRecyclerView lstStory = ViewBindings.findChildViewById(rootView, id);
      if (lstStory == null) {
        break missingId;
      }

      id = R.id.lyt1;
      AppBarLayout lyt1 = ViewBindings.findChildViewById(rootView, id);
      if (lyt1 == null) {
        break missingId;
      }

      id = R.id.lytLeftMenu;
      LinearLayout lytLeftMenu = ViewBindings.findChildViewById(rootView, id);
      if (lytLeftMenu == null) {
        break missingId;
      }

      id = R.id.lytProfile;
      LinearLayout lytProfile = ViewBindings.findChildViewById(rootView, id);
      if (lytProfile == null) {
        break missingId;
      }

      id = R.id.navAuthor;
      NavigationView navAuthor = ViewBindings.findChildViewById(rootView, id);
      if (navAuthor == null) {
        break missingId;
      }

      id = R.id.navReader;
      NavigationView navReader = ViewBindings.findChildViewById(rootView, id);
      if (navReader == null) {
        break missingId;
      }

      id = R.id.prgIndicator;
      LinearProgressIndicator prgIndicator = ViewBindings.findChildViewById(rootView, id);
      if (prgIndicator == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.txtCost;
      TextView txtCost = ViewBindings.findChildViewById(rootView, id);
      if (txtCost == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new FragmentMainBinding((DrawerLayout) rootView, btnSearch, crdUser, drwLayout,
          imgAuthor, lstStory, lyt1, lytLeftMenu, lytProfile, navAuthor, navReader, prgIndicator,
          toolbar, txtCost, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
