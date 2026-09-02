(ns simple-billy-api.specs.pay-gap-info-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pay-gap-info-response-data
  {
   (ds/req :employee_id) uuid?
   (ds/req :first_name) string?
   (ds/opt :gender) string?
   (ds/opt :group_median_hourly) float?
   (ds/opt :group_median_monthly) float?
   (ds/req :group_size) int?
   (ds/req :job_title) string?
   (ds/req :last_name) string?
   (ds/opt :overall_median_hourly) float?
   (ds/opt :own_hourly_gross) float?
   (ds/opt :own_monthly_gross) float?
   })

(def pay-gap-info-response-spec
  (ds/spec
    {:name ::pay-gap-info-response
     :spec pay-gap-info-response-data}))
