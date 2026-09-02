(ns simple-billy-api.specs.offenlegung-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.offenlegung-item :refer :all]
            )
  (:import (java.io File)))


(def offenlegung-report-data
  {
   (ds/req :deadline) inst?
   (ds/req :deadline_months) int?
   (ds/req :items) (s/coll-of offenlegung-item-spec)
   (ds/req :kapitalmarktorientiert) boolean?
   (ds/req :note) string?
   (ds/req :year) int?
   })

(def offenlegung-report-spec
  (ds/spec
    {:name ::offenlegung-report
     :spec offenlegung-report-data}))
