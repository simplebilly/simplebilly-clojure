(ns simple-billy-api.specs.plausibility-check
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.severity :refer :all]
            [simple-billy-api.specs.check-status :refer :all]
            )
  (:import (java.io File)))


(def plausibility-check-data
  {
   (ds/req :detail) string?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :severity) severity-spec
   (ds/req :status) check-status-spec
   })

(def plausibility-check-spec
  (ds/spec
    {:name ::plausibility-check
     :spec plausibility-check-data}))
