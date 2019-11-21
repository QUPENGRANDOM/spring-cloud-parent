package com.pengq.user.center;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pengq on 2019/11/21 10:54.
 */
@Component
@ConfigurationProperties(prefix = "plot.process")
public class PlotProcessProperties {
    private List<PlotPhase> plotPhases;

    public List<PlotPhase> getPlotPhases() {
        return plotPhases;
    }

    public void setPlotPhases(List<PlotPhase> plotPhases) {
        this.plotPhases = plotPhases;
    }

    public static class PlotPhase {
        private String id;
        private String name;
        private boolean revert;
        private boolean lastPhase;
        private String uniqueKey = "";

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isRevert() {
            return revert;
        }

        public void setRevert(boolean revert) {
            this.revert = revert;
        }

        public boolean isLastPhase() {
            return lastPhase;
        }

        public void setLastPhase(boolean lastPhase) {
            this.lastPhase = lastPhase;
        }

        public String getUniqueKey() {
            return uniqueKey;
        }

        public void setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
        }

        @Override
        public String toString() {
            return "PlotPhase{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", revert=" + revert +
                    ", lastPhase=" + lastPhase +
                    ", uniqueKey='" + uniqueKey + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PlotProcessProperties{" +
                "plotPhases=" + plotPhases +
                '}';
    }
}
