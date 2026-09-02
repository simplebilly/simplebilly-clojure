(ns simple-billy-api.specs.pay-gap-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.job-title-gap :refer :all]
            [simple-billy-api.specs.quartile-band :refer :all]
            )
  (:import (java.io File)))


(def pay-gap-report-data
  {
   (ds/req :by_job_title) (s/coll-of job-title-gap-spec)
   (ds/req :diverse_count) int?
   (ds/req :employee_count) int?
   (ds/req :female_count) int?
   (ds/req :male_count) int?
   (ds/req :mean_gap_pct) float?
   (ds/req :median_gap_pct) float?
   (ds/req :quartiles) (s/coll-of quartile-band-spec)
   })

(def pay-gap-report-spec
  (ds/spec
    {:name ::pay-gap-report
     :spec pay-gap-report-data}))
