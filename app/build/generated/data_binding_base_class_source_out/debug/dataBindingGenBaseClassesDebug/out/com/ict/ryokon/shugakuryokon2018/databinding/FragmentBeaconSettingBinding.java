package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.model.UserData;
import com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBeaconSettingBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonCancel;

  @NonNull
  public final Button buttonStart;

  @NonNull
  public final EditText minorEditText;

  @Bindable
  protected UserData mAdapter;

  @Bindable
  protected BeaconSettingViewModel mViewmodel;

  protected FragmentBeaconSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonCancel, Button buttonStart, EditText minorEditText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonCancel = buttonCancel;
    this.buttonStart = buttonStart;
    this.minorEditText = minorEditText;
  }

  public abstract void setAdapter(@Nullable UserData adapter);

  @Nullable
  public UserData getAdapter() {
    return mAdapter;
  }

  public abstract void setViewmodel(@Nullable BeaconSettingViewModel viewmodel);

  @Nullable
  public BeaconSettingViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentBeaconSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beacon_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeaconSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBeaconSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_setting, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBeaconSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beacon_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeaconSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBeaconSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_setting, null, false, component);
  }

  public static FragmentBeaconSettingBinding bind(@NonNull View view) {
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
  public static FragmentBeaconSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBeaconSettingBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_setting);
  }
}
