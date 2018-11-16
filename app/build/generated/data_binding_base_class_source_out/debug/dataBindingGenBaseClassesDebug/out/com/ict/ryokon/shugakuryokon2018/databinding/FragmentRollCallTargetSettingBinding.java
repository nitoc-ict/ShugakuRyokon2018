package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRollCallTargetSettingBinding extends ViewDataBinding {
  @Bindable
  protected RollCallTargetSettingAdapter mAdapter;

  protected FragmentRollCallTargetSettingBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setAdapter(@Nullable RollCallTargetSettingAdapter adapter);

  @Nullable
  public RollCallTargetSettingAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static FragmentRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_roll_call_target_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRollCallTargetSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call_target_setting, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_roll_call_target_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRollCallTargetSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call_target_setting, null, false, component);
  }

  public static FragmentRollCallTargetSettingBinding bind(@NonNull View view) {
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
  public static FragmentRollCallTargetSettingBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentRollCallTargetSettingBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call_target_setting);
  }
}
