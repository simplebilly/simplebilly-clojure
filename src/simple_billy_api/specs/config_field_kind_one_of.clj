(ns simple-billy-api.specs.config-field-kind-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-field-kind-one-of-data
  {
   (ds/req :type) string?
   })

(def config-field-kind-one-of-spec
  (ds/spec
    {:name ::config-field-kind-one-of
     :spec config-field-kind-one-of-data}))
