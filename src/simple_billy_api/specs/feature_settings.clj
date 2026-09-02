(ns simple-billy-api.specs.feature-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def feature-settings-data
  {
   (ds/req :onlineshop) boolean?
   (ds/req :reportBilanz) boolean?
   (ds/req :reportBwa) boolean?
   (ds/req :reportEuer) boolean?
   (ds/req :reportGewerbesteuer) boolean?
   (ds/req :reportGuv) boolean?
   (ds/req :reportKst) boolean?
   (ds/req :reportUstva) boolean?
   })

(def feature-settings-spec
  (ds/spec
    {:name ::feature-settings
     :spec feature-settings-data}))
