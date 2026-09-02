(ns simple-billy-api.specs.job-title-gap
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def job-title-gap-data
  {
   (ds/req :employee_count) int?
   (ds/req :female_mean_hourly) string?
   (ds/req :job_title) string?
   (ds/req :male_mean_hourly) string?
   (ds/req :mean_gap_pct) float?
   (ds/req :median_gap_pct) float?
   })

(def job-title-gap-spec
  (ds/spec
    {:name ::job-title-gap
     :spec job-title-gap-data}))
