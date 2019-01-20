package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.ui.rollcall.RollCallViewModel;
import com.ict.ryokon.shugakuryokon2018.ui.rollcall.view.RollCallAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRollCallBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout attendNum;

  @NonNull
  public final TextView unattendNum;

  @Bindable
  protected RollCallAdapter mAdapter;

  @Bindable
  protected RollCallViewModel mViewmodel;

  @Bindable
  protected View.OnClickListener mFabOnClick;

  protected FragmentRollCallBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout attendNum, TextView unattendNum) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attendNum = attendNum;
    this.unattendNum = unattendNum;
  }

  public abstract void setAdapter(@Nullable RollCallAdapter adapter);

  @Nullable
  public RollCallAdapter getAdapter() {
    return mAdapter;
  }

  public abstract void setViewmodel(@Nullable RollCallViewModel viewmodel);

  @Nullable
  public RollCallViewModel getViewmodel() {
    return mViewmodel;
  }

  public abstract void setFabOnClick(@Nullable View.OnClickListener fabOnClick);

  @Nullable
  public View.OnClickListener getFabOnClick() {
    return mFabOnClick;
  }

  @NonNull
  public static FragmentRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_roll_call, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRollCallBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRollCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_roll_call, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRollCallBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call, null, false, component);
  }

  public static FragmentRollCallBinding bind(@NonNull View view) {
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
  public static FragmentRollCallBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRollCallBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call);
  }
}
