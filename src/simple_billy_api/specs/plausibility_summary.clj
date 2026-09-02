(ns simple-billy-api.specs.plausibility-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.check-status :refer :all]
            )
  (:import (java.io File)))


(def plausibility-summary-data
  {
   (ds/req :errors) int?
   (ds/req :overall_status) check-status-spec
   (ds/req :passed) int?
   (ds/req :total_checks) int?
   (ds/req :warnings) int?
   })

(def plausibility-summary-spec
  (ds/spec
    {:name ::plausibility-summary
     :spec plausibility-summary-data}))
