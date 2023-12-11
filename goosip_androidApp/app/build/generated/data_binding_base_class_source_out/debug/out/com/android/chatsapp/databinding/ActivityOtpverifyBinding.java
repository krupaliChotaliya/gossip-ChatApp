// Generated by view binder compiler. Do not edit!
package com.android.chatsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.chatsapp.R;
import com.mukeshsolanki.OtpView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOtpverifyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView lblphoneno;

  @NonNull
  public final OtpView otpView;

  @NonNull
  public final ImageView phoneverificationimg;

  @NonNull
  public final TextView textView2;

  private ActivityOtpverifyBinding(@NonNull LinearLayout rootView, @NonNull TextView lblphoneno,
      @NonNull OtpView otpView, @NonNull ImageView phoneverificationimg,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.lblphoneno = lblphoneno;
    this.otpView = otpView;
    this.phoneverificationimg = phoneverificationimg;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOtpverifyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOtpverifyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_otpverify, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOtpverifyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lblphoneno;
      TextView lblphoneno = ViewBindings.findChildViewById(rootView, id);
      if (lblphoneno == null) {
        break missingId;
      }

      id = R.id.otp_view;
      OtpView otpView = ViewBindings.findChildViewById(rootView, id);
      if (otpView == null) {
        break missingId;
      }

      id = R.id.phoneverificationimg;
      ImageView phoneverificationimg = ViewBindings.findChildViewById(rootView, id);
      if (phoneverificationimg == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityOtpverifyBinding((LinearLayout) rootView, lblphoneno, otpView,
          phoneverificationimg, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
