(ns simple-billy-api.specs.plausibility-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.plausibility-check :refer :all]
            [simple-billy-api.specs.plausibility-summary :refer :all]
            )
  (:import (java.io File)))


(def plausibility-report-data
  {
   (ds/req :checks) (s/coll-of plausibility-check-spec)
   (ds/req :generated_at) string?
   (ds/req :summary) plausibility-summary-spec
   })

(def plausibility-report-spec
  (ds/spec
    {:name ::plausibility-report
     :spec plausibility-report-data}))
