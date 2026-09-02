(ns simple-billy-api.specs.quota-override-features
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quota-override-features-data
  {
   (ds/opt :erp) boolean?
   (ds/opt :fancy_reports) boolean?
   (ds/opt :tax_automations) boolean?
   })

(def quota-override-features-spec
  (ds/spec
    {:name ::quota-override-features
     :spec quota-override-features-data}))
