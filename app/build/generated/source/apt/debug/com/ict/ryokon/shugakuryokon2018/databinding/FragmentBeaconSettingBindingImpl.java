package com.ict.ryokon.shugakuryokon2018.databinding;
import com.ict.ryokon.shugakuryokon2018.R;
import com.ict.ryokon.shugakuryokon2018.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBeaconSettingBindingImpl extends FragmentBeaconSettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnTextChangedImpl mViewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    private OnClickListenerImpl mViewmodelChangeOnClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewmodelCancelOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentBeaconSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentBeaconSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[1]
            );
        this.buttonCancel.setTag(null);
        this.buttonStart.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minorEditText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.adapter == variableId) {
            setAdapter((com.ict.ryokon.shugakuryokon2018.model.UserData) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapter(@Nullable com.ict.ryokon.shugakuryokon2018.model.UserData Adapter) {
        this.mAdapter = Adapter;
    }
    public void setViewmodel(@Nullable com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelChangeable((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelChangeable(androidx.databinding.ObservableBoolean ViewmodelChangeable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewmodelChangeableButtonStartAndroidColorColorAccentButtonStartAndroidColorColorSubText = 0;
        java.lang.Integer viewmodelUserdataMinorValue = null;
        java.lang.String viewmodelUserdataMinorValueToString = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged viewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;
        android.view.View.OnClickListener viewmodelChangeOnClickAndroidViewViewOnClickListener = null;
        com.ict.ryokon.shugakuryokon2018.model.Minor viewmodelUserdataMinor = null;
        int viewmodelChangeableButtonCancelAndroidColorColorCancelTextButtonCancelAndroidColorColorSubText = 0;
        android.view.View.OnClickListener viewmodelCancelOnClickAndroidViewViewOnClickListener = null;
        boolean viewmodelChangeableGet = false;
        androidx.databinding.ObservableBoolean viewmodelChangeable = null;
        com.ict.ryokon.shugakuryokon2018.model.UserData viewmodelUserdata = null;
        com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onMinorChanged
                        viewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mViewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mViewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mViewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(viewmodel));
                        // read viewmodel::changeOnClick
                        viewmodelChangeOnClickAndroidViewViewOnClickListener = (((mViewmodelChangeOnClickAndroidViewViewOnClickListener == null) ? (mViewmodelChangeOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelChangeOnClickAndroidViewViewOnClickListener).setValue(viewmodel));
                        // read viewmodel::cancelOnClick
                        viewmodelCancelOnClickAndroidViewViewOnClickListener = (((mViewmodelCancelOnClickAndroidViewViewOnClickListener == null) ? (mViewmodelCancelOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewmodelCancelOnClickAndroidViewViewOnClickListener).setValue(viewmodel));
                        // read viewmodel.userdata
                        viewmodelUserdata = viewmodel.getUserdata();
                    }


                    if (viewmodelUserdata != null) {
                        // read viewmodel.userdata.minor
                        viewmodelUserdataMinor = viewmodelUserdata.getMinor();
                    }


                    if (viewmodelUserdataMinor != null) {
                        // read viewmodel.userdata.minor.value
                        viewmodelUserdataMinorValue = viewmodelUserdataMinor.getValue();
                    }


                    if (viewmodelUserdataMinorValue != null) {
                        // read viewmodel.userdata.minor.value.toString()
                        viewmodelUserdataMinorValueToString = viewmodelUserdataMinorValue.toString();
                    }
            }

                if (viewmodel != null) {
                    // read viewmodel.changeable
                    viewmodelChangeable = viewmodel.getChangeable();
                }
                updateRegistration(0, viewmodelChangeable);


                if (viewmodelChangeable != null) {
                    // read viewmodel.changeable.get()
                    viewmodelChangeableGet = viewmodelChangeable.get();
                }
            if((dirtyFlags & 0xdL) != 0) {
                if(viewmodelChangeableGet) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read viewmodel.changeable.get() ? @android:color/colorAccent : @android:color/colorSubText
                viewmodelChangeableButtonStartAndroidColorColorAccentButtonStartAndroidColorColorSubText = ((viewmodelChangeableGet) ? (getColorFromResource(buttonStart, R.color.colorAccent)) : (getColorFromResource(buttonStart, R.color.colorSubText)));
                // read viewmodel.changeable.get() ? @android:color/colorCancelText : @android:color/colorSubText
                viewmodelChangeableButtonCancelAndroidColorColorCancelTextButtonCancelAndroidColorColorSubText = ((viewmodelChangeableGet) ? (getColorFromResource(buttonCancel, R.color.colorCancelText)) : (getColorFromResource(buttonCancel, R.color.colorSubText)));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.buttonCancel.setTextColor(viewmodelChangeableButtonCancelAndroidColorColorCancelTextButtonCancelAndroidColorColorSubText);
            this.buttonStart.setTextColor(viewmodelChangeableButtonStartAndroidColorColorAccentButtonStartAndroidColorColorSubText);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.buttonCancel.setOnClickListener(viewmodelCancelOnClickAndroidViewViewOnClickListener);
            this.buttonStart.setOnClickListener(viewmodelChangeOnClickAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.minorEditText, viewmodelUserdataMinorValueToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.minorEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)viewmodelOnMinorChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value;
        public OnTextChangedImpl setValue(com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onMinorChanged(arg0, arg1, arg2, arg3); 
        }
    }
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value;
        public OnClickListenerImpl setValue(com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.changeOnClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value;
        public OnClickListenerImpl1 setValue(com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.BeaconSettingViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.cancelOnClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.changeable
        flag 1 (0x2L): adapter
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.changeable.get() ? @android:color/colorAccent : @android:color/colorSubText
        flag 5 (0x6L): viewmodel.changeable.get() ? @android:color/colorAccent : @android:color/colorSubText
        flag 6 (0x7L): viewmodel.changeable.get() ? @android:color/colorCancelText : @android:color/colorSubText
        flag 7 (0x8L): viewmodel.changeable.get() ? @android:color/colorCancelText : @android:color/colorSubText
    flag mapping end*/
    //end
}