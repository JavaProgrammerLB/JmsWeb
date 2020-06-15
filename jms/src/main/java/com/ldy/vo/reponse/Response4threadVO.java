package com.ldy.vo.reponse;


/**
 * threadVO
 * @ClassName: com.ldy.vo.reponse.Response4threadVO.java
 * @author: songxulin
 * @date :  2020-06-11 19:25
 * @version V1.0
 */
public class Response4threadVO {
    /**
     * 检测开始时间 HH:mm:ss
     */
    private String timeStart;
    /**
     * 检测结束时间HH:mm:ss
     */
    private String timeEnd;

    private ThreadCount threadCount;

    public static class ThreadCount {
        public ThreadCount() {
            super();
        }

        public ThreadCount(int threadCount, long totalStartedThreadCount, long daemonThreadCount, int peakThreadCount) {
            this.threadCount = threadCount;
            this.totalStartedThreadCount = totalStartedThreadCount;
            this.daemonThreadCount = daemonThreadCount;
            this.peakThreadCount = peakThreadCount;
        }
        /**
         * 当前活动线程数
         */
        private int threadCount;
        /**
         * 已启动的总数
         */
        private long totalStartedThreadCount;
        /**
         * 守护线程
         */
        private long daemonThreadCount;
        /**
         * 实时峰值
         */
        private int peakThreadCount;

        public int getThreadCount() {
            return threadCount;
        }

        public void setThreadCount(int threadCount) {
            this.threadCount = threadCount;
        }

        public long getTotalStartedThreadCount() {
            return totalStartedThreadCount;
        }

        public void setTotalStartedThreadCount(long totalStartedThreadCount) {
            this.totalStartedThreadCount = totalStartedThreadCount;
        }

        public long getDaemonThreadCount() {
            return daemonThreadCount;
        }

        public void setDaemonThreadCount(long daemonThreadCount) {
            this.daemonThreadCount = daemonThreadCount;
        }

        public int getPeakThreadCount() {
            return peakThreadCount;
        }

        public void setPeakThreadCount(int peakThreadCount) {
            this.peakThreadCount = peakThreadCount;
        }
    }
}
