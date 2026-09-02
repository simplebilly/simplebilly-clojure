(ns simple-billy-api.specs.plugin-error-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-data
  {
   (ds/req :BadRequest) (s/coll-of any?)
   })

(def plugin-error-one-of-spec
  (ds/spec
    {:name ::plugin-error-one-of
     :spec plugin-error-one-of-data}))
