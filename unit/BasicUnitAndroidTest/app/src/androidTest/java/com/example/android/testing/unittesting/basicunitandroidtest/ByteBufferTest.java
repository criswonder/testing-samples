package com.example.android.testing.unittesting.basicunitandroidtest;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.nio.ByteBuffer;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class ByteBufferTest {
    private String TAG = "ByteBufferTest";
    private boolean VERBOSE = true;

    @Test
    public void testByteBuffer() {
        if (VERBOSE) Log.d(TAG, "testByteBuffer() called");
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byte b = 0x011;
        byteBuffer.put(b);
        int remaining = byteBuffer.remaining();
        if (VERBOSE) Log.d(TAG, "testByteBuffer: remaining="+remaining);
    }
}
