package reimu.weixia.th.dreamer.thread;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sy on 18.9.29
 */

public class Threads {

    Executor executor = new Executor() {
        @Override
        public void execute(@NonNull Runnable runnable) {

        }
    };

//    @WorkerThread

    Callable callable = new Callable() {
        @Override
        public Object call() throws Exception {
            return null;
        }
    };

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    Process process = new Process() {
        @Override
        public OutputStream getOutputStream() {
            return null;
        }

        @Override
        public InputStream getInputStream() {
            return null;
        }

        @Override
        public InputStream getErrorStream() {
            return null;
        }

        @Override
        public int waitFor() throws InterruptedException {
            return 0;
        }

        @Override
        public int exitValue() {
            return 0;
        }

        @Override
        public void destroy() {

        }
    };

    Future future = new Future() {
        @Override
        public boolean cancel(boolean b) {
            return false;
        }

        @Override
        public boolean isCancelled() {
            return false;
        }

        @Override
        public boolean isDone() {
            return false;
        }

        @Override
        public Object get() throws InterruptedException, ExecutionException {
            return null;
        }

        @Override
        public Object get(long l, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }
    };

    FutureTask futureTask = new FutureTask(callable);

    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 8, 100, TimeUnit.SECONDS
            , new BlockingQueue<Runnable>() {
        @Override
        public boolean add(Runnable runnable) {
            return false;
        }

        @Override
        public boolean offer(@NonNull Runnable runnable) {
            return false;
        }

        @Override
        public void put(Runnable runnable) throws InterruptedException {

        }

        @Override
        public boolean offer(Runnable runnable, long l, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return false;
        }

        @Override
        public Runnable take() throws InterruptedException {
            return null;
        }

        @Override
        public Runnable poll(long l, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return null;
        }

        @Override
        public int remainingCapacity() {
            return 0;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public int drainTo(@NonNull Collection<? super Runnable> collection) {
            return 0;
        }

        @Override
        public int drainTo(@NonNull Collection<? super Runnable> collection, int i) {
            return 0;
        }

        @Override
        public Runnable remove() {
            return null;
        }

        @Override
        public Runnable poll() {
            return null;
        }

        @Override
        public Runnable element() {
            return null;
        }

        @Override
        public Runnable peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Runnable> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Runnable> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }
    });

    // synchronized

    ReentrantLock reentrantLock = new ReentrantLock();

    AtomicInteger atomicInteger = new AtomicInteger();

//    CAS
}
