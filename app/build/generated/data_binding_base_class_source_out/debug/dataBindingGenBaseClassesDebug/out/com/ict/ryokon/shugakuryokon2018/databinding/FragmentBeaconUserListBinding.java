package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list.BeaconAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBeaconUserListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView fragmentUserlist;

  @Bindable
  protected BeaconAdapter mAdapter;

  protected FragmentBeaconUserListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView fragmentUserlist) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentUserlist = fragmentUserlist;
  }

  public abstract void setAdapter(@Nullable BeaconAdapter adapter);

  @Nullable
  public BeaconAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static FragmentBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beacon_user_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBeaconUserListBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_user_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBeaconUserListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beacon_user_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBeaconUserListBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_user_list, null, false, component);
  }

  public static FragmentBeaconUserListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentBeaconUserListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBeaconUserListBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_user_list);
  }
}
