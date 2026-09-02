(ns simple-billy-api.specs.config-field-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.config-field-kind :refer :all]
            )
  (:import (java.io File)))


(def config-field-info-data
  {
   (ds/req :kind) config-field-kind-spec
   (ds/req :label) string?
   (ds/req :name) string?
   (ds/opt :placeholder) string?
   (ds/req :required) boolean?
   })

(def config-field-info-spec
  (ds/spec
    {:name ::config-field-info
     :spec config-field-info-data}))
