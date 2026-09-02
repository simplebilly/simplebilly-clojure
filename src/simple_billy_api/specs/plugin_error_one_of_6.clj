(ns simple-billy-api.specs.plugin-error-one-of-6
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-6-data
  {
   (ds/req :NotImplemented) string?
   })

(def plugin-error-one-of-6-spec
  (ds/spec
    {:name ::plugin-error-one-of-6
     :spec plugin-error-one-of-6-data}))
