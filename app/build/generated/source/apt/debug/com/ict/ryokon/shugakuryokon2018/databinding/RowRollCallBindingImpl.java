package com.ict.ryokon.shugakuryokon2018.databinding;
import com.ict.ryokon.shugakuryokon2018.R;
import com.ict.ryokon.shugakuryokon2018.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowRollCallBindingImpl extends RowRollCallBinding  {

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
    // Inverse Binding Event Handlers

    public RowRollCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RowRollCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.attendNumber.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameKana.setTag(null);
        this.nameKanji.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.userdata == variableId) {
            setUserdata((com.ict.ryokon.shugakuryokon2018.model.UserData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserdata(@Nullable com.ict.ryokon.shugakuryokon2018.model.UserData Userdata) {
        this.mUserdata = Userdata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userdata);
        super.requestRebind();
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
        com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber userdataAttendanceNumber = null;
        int userdataAttendNameKanjiAndroidColorColorAttendMainTextNameKanjiAndroidColorColorUnAttendMainText = 0;
        int userdataAttendAttendNumberAndroidColorColorAttendMainTextAttendNumberAndroidColorColorUnAttendMainText = 0;
        java.lang.Integer userdataAttendanceNumberValue = null;
        com.ict.ryokon.shugakuryokon2018.model.Name userdataName = null;
        com.ict.ryokon.shugakuryokon2018.model.UserData userdata = mUserdata;
        java.lang.String userdataNameKanji = null;
        int userdataAttendNameKanaAndroidColorColorAttendSubTextNameKanaAndroidColorColorUnAttendSubText = 0;
        java.lang.String userdataAttendanceNumberValueToString = null;
        boolean userdataAttend = false;
        java.lang.String userdataNameHiragana = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userdata != null) {
                    // read userdata.attendanceNumber
                    userdataAttendanceNumber = userdata.getAttendanceNumber();
                    // read userdata.name
                    userdataName = userdata.getName();
                    // read userdata.attend
                    userdataAttend = userdata.isAttend();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(userdataAttend) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                if (userdataAttendanceNumber != null) {
                    // read userdata.attendanceNumber.value
                    userdataAttendanceNumberValue = userdataAttendanceNumber.getValue();
                }
                if (userdataName != null) {
                    // read userdata.name.kanji
                    userdataNameKanji = userdataName.getKanji();
                    // read userdata.name.hiragana
                    userdataNameHiragana = userdataName.getHiragana();
                }
                // read userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
                userdataAttendNameKanjiAndroidColorColorAttendMainTextNameKanjiAndroidColorColorUnAttendMainText = ((userdataAttend) ? (getColorFromResource(nameKanji, R.color.colorAttendMainText)) : (getColorFromResource(nameKanji, R.color.colorUnAttendMainText)));
                // read userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
                userdataAttendAttendNumberAndroidColorColorAttendMainTextAttendNumberAndroidColorColorUnAttendMainText = ((userdataAttend) ? (getColorFromResource(attendNumber, R.color.colorAttendMainText)) : (getColorFromResource(attendNumber, R.color.colorUnAttendMainText)));
                // read userdata.attend ? @android:color/colorAttendSubText : @android:color/colorUnAttendSubText
                userdataAttendNameKanaAndroidColorColorAttendSubTextNameKanaAndroidColorColorUnAttendSubText = ((userdataAttend) ? (getColorFromResource(nameKana, R.color.colorAttendSubText)) : (getColorFromResource(nameKana, R.color.colorUnAttendSubText)));


                if (userdataAttendanceNumberValue != null) {
                    // read userdata.attendanceNumber.value.toString()
                    userdataAttendanceNumberValueToString = userdataAttendanceNumberValue.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.attendNumber, userdataAttendanceNumberValueToString);
            this.attendNumber.setTextColor(userdataAttendAttendNumberAndroidColorColorAttendMainTextAttendNumberAndroidColorColorUnAttendMainText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameKana, userdataNameHiragana);
            this.nameKana.setTextColor(userdataAttendNameKanaAndroidColorColorAttendSubTextNameKanaAndroidColorColorUnAttendSubText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameKanji, userdataNameKanji);
            this.nameKanji.setTextColor(userdataAttendNameKanjiAndroidColorColorAttendMainTextNameKanjiAndroidColorColorUnAttendMainText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userdata
        flag 1 (0x2L): null
        flag 2 (0x3L): userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
        flag 3 (0x4L): userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
        flag 4 (0x5L): userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
        flag 5 (0x6L): userdata.attend ? @android:color/colorAttendMainText : @android:color/colorUnAttendMainText
        flag 6 (0x7L): userdata.attend ? @android:color/colorAttendSubText : @android:color/colorUnAttendSubText
        flag 7 (0x8L): userdata.attend ? @android:color/colorAttendSubText : @android:color/colorUnAttendSubText
    flag mapping end*/
    //end
}