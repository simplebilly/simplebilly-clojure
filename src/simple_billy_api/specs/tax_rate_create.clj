(ns simple-billy-api.specs.tax-rate-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tax-rate-create-data
  {
   (ds/req :countryCode) string?
   (ds/opt :effectiveFrom) inst?
   (ds/req :isDefault) boolean?
   (ds/req :name) string?
   (ds/req :ratePercent) int?
   })

(def tax-rate-create-spec
  (ds/spec
    {:name ::tax-rate-create
     :spec tax-rate-create-data}))
