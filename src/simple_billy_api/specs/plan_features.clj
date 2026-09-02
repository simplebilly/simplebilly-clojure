(ns simple-billy-api.specs.plan-features
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plan-features-data
  {
   (ds/req :connectors) boolean?
   (ds/req :erp) boolean?
   (ds/req :fancyReports) boolean?
   (ds/req :taxAutomations) boolean?
   })

(def plan-features-spec
  (ds/spec
    {:name ::plan-features
     :spec plan-features-data}))
