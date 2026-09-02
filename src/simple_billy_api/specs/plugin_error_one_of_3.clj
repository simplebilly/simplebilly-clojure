(ns simple-billy-api.specs.plugin-error-one-of-3
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-3-data
  {
   (ds/req :InternalError) (s/coll-of any?)
   })

(def plugin-error-one-of-3-spec
  (ds/spec
    {:name ::plugin-error-one-of-3
     :spec plugin-error-one-of-3-data}))
