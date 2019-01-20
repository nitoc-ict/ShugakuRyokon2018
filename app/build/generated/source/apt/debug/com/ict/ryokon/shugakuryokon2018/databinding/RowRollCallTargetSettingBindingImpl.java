package com.ict.ryokon.shugakuryokon2018.databinding;
import com.ict.ryokon.shugakuryokon2018.R;
import com.ict.ryokon.shugakuryokon2018.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowRollCallTargetSettingBindingImpl extends RowRollCallTargetSettingBinding  {

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
    private OnCheckedChangeListenerImpl mBindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener;
    // Inverse Binding Event Handlers

    public RowRollCallTargetSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowRollCallTargetSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Switch) bindings[4]
            );
        this.attendNumText.setTag(null);
        this.mainText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subText.setTag(null);
        this.targetSwitch.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.bindingmodel == variableId) {
            setBindingmodel((com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel) variable);
        }
        else if (BR.userdata == variableId) {
            setUserdata((com.ict.ryokon.shugakuryokon2018.model.UserData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBindingmodel(@Nullable com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel Bindingmodel) {
        this.mBindingmodel = Bindingmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bindingmodel);
        super.requestRebind();
    }
    public void setUserdata(@Nullable com.ict.ryokon.shugakuryokon2018.model.UserData Userdata) {
        this.mUserdata = Userdata;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.ict.ryokon.shugakuryokon2018.model.UserData bindingmodelUserData = null;
        java.lang.String bindingmodelUserDataNameHiragana = null;
        boolean bindingmodelUserDataRollCallTarget = false;
        com.ict.ryokon.shugakuryokon2018.model.Name bindingmodelUserDataName = null;
        java.lang.String bindingmodelUserDataAttendanceNumberValueToString = null;
        java.lang.String bindingmodelUserDataNameKanji = null;
        com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel bindingmodel = mBindingmodel;
        android.widget.CompoundButton.OnCheckedChangeListener bindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = null;
        java.lang.Integer bindingmodelUserDataAttendanceNumberValue = null;
        com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber bindingmodelUserDataAttendanceNumber = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (bindingmodel != null) {
                    // read bindingmodel.userData
                    bindingmodelUserData = bindingmodel.getUserData();
                    // read bindingmodel::onCheckedChanged
                    bindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = (((mBindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener == null) ? (mBindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mBindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener).setValue(bindingmodel));
                }


                if (bindingmodelUserData != null) {
                    // read bindingmodel.userData.rollCallTarget
                    bindingmodelUserDataRollCallTarget = bindingmodelUserData.isRollCallTarget();
                    // read bindingmodel.userData.name
                    bindingmodelUserDataName = bindingmodelUserData.getName();
                    // read bindingmodel.userData.attendanceNumber
                    bindingmodelUserDataAttendanceNumber = bindingmodelUserData.getAttendanceNumber();
                }


                if (bindingmodelUserDataName != null) {
                    // read bindingmodel.userData.name.hiragana
                    bindingmodelUserDataNameHiragana = bindingmodelUserDataName.getHiragana();
                    // read bindingmodel.userData.name.kanji
                    bindingmodelUserDataNameKanji = bindingmodelUserDataName.getKanji();
                }
                if (bindingmodelUserDataAttendanceNumber != null) {
                    // read bindingmodel.userData.attendanceNumber.value
                    bindingmodelUserDataAttendanceNumberValue = bindingmodelUserDataAttendanceNumber.getValue();
                }


                if (bindingmodelUserDataAttendanceNumberValue != null) {
                    // read bindingmodel.userData.attendanceNumber.value.toString()
                    bindingmodelUserDataAttendanceNumberValueToString = bindingmodelUserDataAttendanceNumberValue.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.attendNumText, bindingmodelUserDataAttendanceNumberValueToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mainText, bindingmodelUserDataNameKanji);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subText, bindingmodelUserDataNameHiragana);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.targetSwitch, bindingmodelUserDataRollCallTarget);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.targetSwitch, (android.widget.CompoundButton.OnCheckedChangeListener)bindingmodelOnCheckedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.CompoundButton.OnCheckedChangeListener{
        private com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel value;
        public OnCheckedChangeListenerImpl setValue(com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
            this.value.onCheckedChanged(arg0, arg1); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bindingmodel
        flag 1 (0x2L): userdata
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}